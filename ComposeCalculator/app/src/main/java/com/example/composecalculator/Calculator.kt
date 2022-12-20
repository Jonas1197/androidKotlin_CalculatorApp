package com.example.composecalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.ui.theme.LightGray
import com.example.composecalculator.ui.theme.Orange

@Composable fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp  = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {

            //region Calculation Text
            Text(
                text      = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier  = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize   = 80.sp,
                color      = Color.White,
                maxLines   = 2
            )
            //endregion

            //region 1st Row
            Row(
                modifier              = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )

                CalculatorButton(
                    symbol   = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )

                CalculatorButton(
                    symbol   = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            //endregion

            //region 2nd Row
            Row(
                modifier              = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )

                CalculatorButton(
                    symbol   = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )

                CalculatorButton(
                    symbol   = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )

                CalculatorButton(
                    symbol   = "X",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            //endregion

            //region 3rd Row
            Row(
                modifier              = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )

                CalculatorButton(
                    symbol   = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )

                CalculatorButton(
                    symbol   = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )

                CalculatorButton(
                    symbol   = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            //endregion

            //region 4th Row
            Row(
                modifier              = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )

                CalculatorButton(
                    symbol   = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )

                CalculatorButton(
                    symbol   = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )

                CalculatorButton(
                    symbol   = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
            }
            //endregion

            //region 5th Row
            Row(
                modifier              = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick = {
                        onAction(CalculatorAction.Number(70))
                    }
                )

                CalculatorButton(
                    symbol   = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )

                CalculatorButton(
                    symbol   = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }
            //endregion
        }
    }
}
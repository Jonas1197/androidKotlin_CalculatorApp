package com.example.composecalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.ui.theme.LightGray
import com.example.composecalculator.ui.theme.Orange

@OptIn(ExperimentalComposeUiApi::class)
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
                    .padding(vertical = 32.dp)
                    .semantics {
                        testTagsAsResourceId = true
                        testTag = "calculationText"
                    },
                fontWeight = FontWeight.Light,
                fontSize   = 80.sp,
                color      = Color.White,
                maxLines   = 2
            )
            //endregion

            //region 1st Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "acButton"
                        },

                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )

                CalculatorButton(
                    symbol   = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "delButton"
                        },

                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )

                CalculatorButton(
                    symbol   = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "divideButton"
                        },

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
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "7Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )

                CalculatorButton(
                    symbol   = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "8Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )

                CalculatorButton(
                    symbol   = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "9Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )

                CalculatorButton(
                    symbol   = "X",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "multiplyButton"
                        },

                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            //endregion

            //region 3rd Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol   = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "4Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )

                CalculatorButton(
                    symbol   = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "5Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )

                CalculatorButton(
                    symbol   = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "6Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )

                CalculatorButton(
                    symbol   = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "minusButton"
                        },

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
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "1Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )

                CalculatorButton(
                    symbol   = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "2Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )

                CalculatorButton(
                    symbol   = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "3Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )

                CalculatorButton(
                    symbol   = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "plusButton"
                        },

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
                        .weight(2f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "0Button"
                        },

                    onClick = {
                        onAction(CalculatorAction.Number(70))
                    }
                )

                CalculatorButton(
                    symbol   = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "decimalButton"
                        },

                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )

                CalculatorButton(
                    symbol   = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f)
                        .semantics {
                            testTagsAsResourceId = true
                            testTag = "equalsButton"
                        },

                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }
            //endregion
        }
    }
}

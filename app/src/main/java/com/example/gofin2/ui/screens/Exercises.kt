package com.example.gofin2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gofin2.ui.navigation.TopMenu

@Composable
fun Exercises(navController: NavController) {
    Column {
        TopMenu(navController)

        // Form with Math Questions
        Column {
            Text(text = "This is the UAS exam examples:")

            // Math Question 1
            MathQuestion(
                question = "The price of a hotel room after a 20% price decrease is € 140.00. What was the original price of a hotel room?",
                options = listOf("€112.00", "€160.00", "€168.00", "€175.00","€180.00",)
            )

            // Math Question 2
            MathQuestion(
                question = "In a hotel, restaurant sales were 2/3 of accommodation sales. Restaurant sales and accommodation sales totally were € 200 000 per month, then",
                options = listOf("Restaurant sales were € 60 000 per month", "Restaurant sales were € 66 666 per month", "Accommodation sales were 80.000 per month", "Accommodation sales were € 150 000 per month","Accommodation sales were € 120 000 per month")
            )

            // Additional Math Questions...
        }
    }
}

@Composable
fun MathQuestion(question: String, options: List<String>) {
    // Implement your form logic here, such as handling user selections and validation

    // Display the question
    Text(text = question)

    // Display the options
    options.forEach { option ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = false,
                onClick = { /* Handle option selection */ }
            )
            Text(text = option, modifier = Modifier.padding(start = 8.dp))
        }
    }
}

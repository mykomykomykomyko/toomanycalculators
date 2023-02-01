function powershellcalculator {  
  $num1 = Read-Host "What is your first number here?: "
  $num2 = Read-Host "Might as well tell us your second number."
  $op = Read-Host "Which of the following do you need to do? (+, -, *, /): "
  $result = 0
  if ($op -eq "+") {
    $result = $num1 + $num2
  }
  elseif ($op -eq "-") {
    $result = $num1 - $num2
  }
  elseif ($op -eq "*") {
    $result = $num1 * $num2
  }
  elseif ($op -eq "/") {
    if ($num2 -ne 0) {
      $result = $num1 / $num2
    }
    else {
      Write-Host "Cannot divide by zero, sussy baka!" -ForegroundColor Red
      return
    }
  }
  else {
    Write-Host "What operator is that?" -ForegroundColor Red
    return
  } 
  Write-Host "Result: $result"
}
powershellcalculator

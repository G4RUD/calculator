
#include <stdio.h>

int main() {
    double num1, num2;
    char op;
    
    printf("Simple Calculator\n");
    printf("Enter an expression (e.g., 2 + 3): ");
    if (scanf("%lf %c %lf", &num1, &op, &num2) != 3) {
        printf("Invalid input.\n");
        return 1;
    }

    switch(op) {
        case '+':
            printf("Result: %.2lf\n", num1 + num2);
            break;
        case '-':
            printf("Result: %.2lf\n", num1 - num2);
            break;
        case '*':
            printf("Result: %.2lf\n", num1 * num2);
            break;
        case '/':
            if (num2 != 0)
                printf("Result: %.2lf\n", num1 / num2);
            else
                printf("Error: Division by zero!\n");
            break;
        default:
            printf("Unknown operator '%c'\n", op);
    }
    
    return 0;
}

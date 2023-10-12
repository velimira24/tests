def calculate(first_operand: int, second_operand: int, operator: str) -> int | float:  # : int -> int | float: все это указываем для простоты чтения, того что плучаем на входе и выходе
    """конструкция match похожа на конструкцию if/else/elif, которая выполняет определенные действия в зависимости от некоторого условия.
    Однако функциональность match гораздо шире - она также позволяет извлечь данные из составных типов и применить действия к различным частям объектов."""
    match operator:
        case '+':
            result = first_operand + second_operand
        case '-':
            result = first_operand - second_operand
        case '*':
            result = first_operand * second_operand
        case '/':
            if second_operand != 0:
                result = first_operand / second_operand
            else:
                raise ArithmeticError("нельзя, ну нельзя делить на 0")
        case _:
            raise ValueError("не известный оператор, выберите другое значение: " + operator)
    return result



def calculate_discount(purchase_amount: float, discount_amount: int) -> float:
    if discount_amount < 0:
        raise ArithmeticError("Скидка не может быть меньше нуля")
    elif discount_amount > 100:
        raise ArithmeticError("Скидка не может превышать 100")
    return purchase_amount - (purchase_amount * discount_amount) / 100



if __name__ == "__main__":
    print(calculate(15, 100, '-'))
    print(calculate(25, 5, '*'))
    print(calculate(16, 4, '/'))
    print(calculate_discount(1250, 100))
    print(calculate_discount(3452, 15))
"""
    @author Pranshu Aggarwal
    @url https://hack.codingblocks.com/app/dcb/2740
"""


def main():
    input_data = input().strip().split()
    input_data = [int(x) for x in input_data]
    n, k, l, c, d, p, nl, np = input_data

    number_of_friends = n
    number_of_bottles = k
    amount_of_drink_in_1_bottle = l
    number_of_lemons = c
    number_of_slices_in_1_lemon = d
    total_amount_of_salt = p
    amount_of_drink_in_1_toast = nl
    amount_of_salt_in_1_toast = np

    total_amount_of_drink = number_of_bottles * amount_of_drink_in_1_bottle
    total_lemon_slices = number_of_lemons * number_of_slices_in_1_lemon

    number_of_toasts_by_1_person_based_on_salt = int(total_amount_of_salt / amount_of_salt_in_1_toast)
    number_of_toasts_by_1_person_based_on_drink = int(total_amount_of_drink / amount_of_drink_in_1_toast)
    number_of_toasts_by_1_person_based_on_slices = int(total_lemon_slices / 1)  # Because 1 slice is used per toast

    number_of_toasts_made = int(min(number_of_toasts_by_1_person_based_on_drink, number_of_toasts_by_1_person_based_on_slices, number_of_toasts_by_1_person_based_on_salt) / number_of_friends)
    print(number_of_toasts_made)


if __name__ == "__main__":
    main()

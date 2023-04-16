def swap_first_and_last_element(the_list: list):
    left = 0
    right = len(the_list) - 1

    temp = the_list[left]
    the_list[left] = the_list[right]
    the_list[right] = temp

    return the_list


llist = [1, 2, 3, 4, 5]
print(swap_first_and_last_element(llist))
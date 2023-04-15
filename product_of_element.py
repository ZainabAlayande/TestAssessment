def produce_of_element_in_a_list(llist: list):
    # [1, 2, 3, 4]
    product = 1
    list_to_return = []
    current_index = 0
    for row in range(len(llist)):
        for column in range(len(llist)):
            if column == current_index:
                continue
            product = product * llist[column]

        list_to_return.append(product)
        product = 1
        current_index += 1

    return list_to_return


array = [4, 2, 1, 5, 0]
print(produce_of_element_in_a_list(array))

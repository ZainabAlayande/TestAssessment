word = "Mississippi"

count_of_letter_s = 0
count_of_letter_i = 0

for i in word:
    if i == "s":
        count_of_letter_s += 1

    if i == "i":
        count_of_letter_i += 1


print("Count of letter s -> ", count_of_letter_s)
print("Count of letter i -> ", count_of_letter_i)
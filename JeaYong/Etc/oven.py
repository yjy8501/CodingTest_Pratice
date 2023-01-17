hour, minute = map(int, input().split())
taking_Time = int(input())

if minute + taking_Time >= 60:
    aft_minute = (minute + taking_Time) % 60
    hour += int((minute + taking_Time) / 60)

    if hour >= 24:
        hour = hour % 24
else:
    aft_minute = minute + taking_Time
print(hour, aft_minute)








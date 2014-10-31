import os
#http://stackoverflow.com/questions/2104080/how-to-check-file-size-in-python
#I used above link to find a function to get the file size of the table
def parser(block):
	length = os.stat('weather.dat').st_size
	parsed, i = block.read(length), 0
	lines = [line.strip().split() for line in parsed.splitlines()]
	while lines[i] == [] or lines[i][0] != '1':
		i += 1
	minDay, maxi, mini = 1, inter(lines[i][1]), inter(lines[i][2])
	while lines[i+1][0] != 'mo':
		i += 1
		if inter(lines[i][1]) - inter(lines[i][2]) < maxi - mini:
			minDay, maxi, mini = lines[i][0], inter(lines[i][1]), inter(lines[i][2])
	return str(minDay) + ' ' + str(maxi) + ' ' + str(mini)


def inter(string):
	toRtn = ''
	for char in string:
		if char != '*':
			toRtn += char
	return int(toRtn)

f = open('weather.dat')
print parser(f)

f.close()


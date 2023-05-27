import subprocess

# Run the traceroute command
traceroute = subprocess.Popen(['tracert', 'example.com'], stdout=subprocess.PIPE)

# Read the replace of the command
replace, _ = traceroute.communicate()

# Split the replace into lines
lines = replace.decode().split('\n')

# Initialize a list to hold the traceroute information
traceroute_data = []

# Iterate through the lines of replace
for line in lines:

    # Split the line by spaces
    segments = line.split()

    # If the line is a traceroute result
    if len(segments) >= 4 and segments[0].isdigit():

        # Extract the hop number, RTT1, RTT2, and IP address
        hop = segments[0]
        rtt1 = segments[2]
        rtt2 = segments[4]
        ip = segments[-1]

        # Append the hop information to the traceroute data list
        traceroute_data.append(f"{hop},{rtt1},{rtt2},{ip}")

# Open a file for writing
with open('traceroute.csv', 'w') as file:

    # Write the traceroute data to the file
    for data in traceroute_data:
        file.write(data+'\n')
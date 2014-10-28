require_relative "./rover"

input = File.readlines('input.txt')

plateau = input[0].split(" ").map(&:to_i)

rover1_position = input[1].split[0,2].map(&:to_i)
rover1_direction = input[1].split[2]

rover1 = Rover.new(rover1_position, rover1_direction)

rover2_position = input[3].split[0,2].map(&:to_i)
rover2_direction = input[3].split[2]

rover2 = Rover.new(rover2_position, rover2_direction)



# rover2_position = rover_information[0].split[0,2]
# position = r
	# Rover.new(direction, position)


# @rover1_coordinates = initial_location(input[1].chomp.split(" "))
# 		@rover1_directions = input[2].chomp.split("")
# 		move(@rover1_coordinates, @rover1_directions)
# 		check_location(@rover1_coordinates)

# 		@rover2_coordinates = initial_location(input[3].chomp.split(" "))
# 		@rover2_directions = input[4].chomp.split("")
# 		move(@rover2_coordinates, @rover2_directions)
# 		check_location(@rover2_coordinates)

# 			def initial_location(rover)
# 		columns = ["x", "y", "direction"]
# 		coordinates = Hash[columns.zip([rover[0].to_i, rover[1].to_i, rover[2]])]
# 	end
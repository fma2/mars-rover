
class Rover

	def initialize(coords)
		arr = coords.split(" ")
		@plateau = Array.new(arr[1].to_i) { Array.new (arr[0].to_i)}
	end

	def assign_starting_coords(str)
		starting_coords = str.split(" ")

	end

	def move_on_board(str)

	end

end

#DRIVER CODE

new_rover = Rover.new("5 5")
# assign_starting_coords("1 2 N")
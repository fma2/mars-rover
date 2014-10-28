require_relative "./rover"
require_relative "./rover-manager"
require_relative "./plateau"

input = File.readlines('input.txt')

plateau = Plateau.new(input.shift.chomp.split[0,2].map(&:to_i)) #stored as string

while input != []
	rover_position = input.shift
	position = rover_position.split[0,2].map(&:to_i)
	direction = Directions.from_s(rover_position.split[2])
	rover = Rover.new(position,direction)

	RoverManager.new(rover).direct(input.shift)

	puts rover
	puts "==============="

end

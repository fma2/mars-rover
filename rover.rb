require_relative "./directions"

class Rover

	attr_accessor :position, :direction

	def initialize(current_position, initial_direction)
		@direction = initial_direction
    @position = current_position
	end

	def move
		@position = @direction.move(@position)
	end

	def turn_left
		@direction = @direction.turn_left
	end

	def turn_right
		@direction = @direction.turn_right
	end

	def to_s
		"#{position[0]} #{position[1]} #{direction}"
	end

end
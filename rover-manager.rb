class RoverManager

	def initialize(rover)
		@rover = rover
	end

	def direct(instructions)
		instructions.each_char do |command|
			case 
				when command == "L"
					@rover.turn_left
				when command == "R"
					@rover.turn_right
				when command == "M"
					@rover.move					
			end
		end
	end

end
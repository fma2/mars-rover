module Directions

	def self.from_s(direction)
     case
       when direction == 'N'
         NORTH
       when direction == 'E'
         EAST
       when direction == 'W'
         WEST
       when direction == 'S'
         SOUTH
      end
  end

  class North
  	def turn_right
  		EAST
  	end

  	def turn_left
  		WEST
  	end

  	def move(current_position)
  		x = current_position[0]
  		y = current_position[1] + 1

  		[x,y]
  	end

  	def to_s
  		"N"
  	end

  end

  class South
  	def turn_right
  		WEST
  	end
  	def turn_left
  		EAST
  	end

  	def move(current_position)
  		x = current_position[0]
  		y = current_position[1] - 1

  		[x,y]
  	end

  	def to_s
  		"S"
  	end

  end

  class East
		def turn_right
			SOUTH
		end

		def turn_left
			NORTH
		end

		def move(current_position)
			x = current_position[0] + 1
			y = current_position[1]

			[x,y]
  	end

  	def to_s
  		"E"
  	end

  end

  class West
  	def turn_right
  		NORTH
  	end

  	def turn_left
  		SOUTH
  	end

  	def move(current_position)
  		x = current_position[0] - 1
  		y = current_position[1]

  		[x,y]
  	end

  	def to_s
  		"W"
  	end

  end

	NORTH = North.new
  SOUTH = South.new
  EAST  = East.new
  WEST  = West.new
end

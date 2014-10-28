class Rover

	def initialize(csv)
		input = load_input(csv)
		@plateau_size_coordinates = input[0].chomp.split(" ").map(&:to_i) #an array of integers

		@rover1_coordinates = initial_location(input[1].chomp.split(" "))
		@rover1_directions = input[2].chomp.split("")
		move(@rover1_coordinates, @rover1_directions)
		check_location(@rover1_coordinates)

		@rover2_coordinates = initial_location(input[3].chomp.split(" "))
		@rover2_directions = input[4].chomp.split("")
		move(@rover2_coordinates, @rover2_directions)
		check_location(@rover2_coordinates)

	end

	def initial_location(rover)
		columns = ["x", "y", "direction"]
		coordinates = Hash[columns.zip([rover[0].to_i, rover[1].to_i, rover[2]])]
	end

	def load_input(csv)
		input = File.new(csv).readlines
	end

	def check_location(rover)
		p rover
	end

	def move(rover, directions)
		directions.each do |movement|
			if movement == "L"
				case rover["direction"]
					when "N"
						rover["direction"] = "W"	
					when "S"
						rover["direction"] = "E"	
					when "E"
						rover["direction"] = "N"
					when "W"
						rover["direction"] = "S"
					else
						puts "something is wrong"
				end
			elsif movement == "R"
				case rover["direction"]
					when "N"
						rover["direction"] = "E"
					when "S"
						rover["direction"] = "W"	
					when "E"
						rover["direction"] = "S"
					when "W"
						rover["direction"] = "N"
					else
						puts "something is wrong"
				end
			elsif movement == "M" && rover["direction"] == "N" || rover["direction"] == "S"
				case rover["direction"]
					when "S"
						rover["y"] -= 1
					when "N"
						rover["y"] += 1
					else
						puts "something is wrong"
				end
			elsif movement == "M" && rover["direction"] == "E" || rover["direction"] == "W"
				case rover["direction"]
					when "W"
						rover["x"] -= 1
					when "E"
						rover["x"] += 1
					else
						puts "something is wrong"
				end
			end
		end
	end

end

#script
rove = Rover.new("input.csv")
#rove.check_location(@rover1_coordinates)
# rove.move(@rover1_coordinates, @rover1_directions)

classdef ChocolateBoiler < handle

    properties(Access=private)
        isEmpty logical
        isBoiled logical
    end

    methods
        function obj = ChocolateBoiler()
            obj.isEmpty = true;
            obj.isBoiled = false;
        end

        function fill(obj)
            if obj.isEmpty
                obj.isEmpty = false;
                obj.isBoiled = false;

                disp('Boiler filled');
            end
        end

        function drain(obj)
            if (~obj.isEmpty && obj.isBoiled)
                obj.isEmpty = true;

                disp('Boiler drained');
            end
        end

        function boil(obj)
            if (~obj.isEmpty && ~obj.isBoiled)
                obj.isBoiled = true;

                disp('Contents boiled');
            end
        end
    end
end
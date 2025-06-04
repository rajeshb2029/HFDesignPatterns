classdef SingletonChocolateBoiler < handle

    % No Static properties in MATLAB
    % Use `Constant` property if the data is constant
    % Use `persistent` variable for mutable

    % properties(Constant, Access=private)
    %     BoilerInstance = []; % cannot be modified afterwards
    % end

    properties(Access=private)
        isEmpty logical
        isBoiled logical
    end

    % private contructor
    methods(Access=private)
        function obj = SingletonChocolateBoiler()
            obj.isEmpty = true;
            obj.isBoiled = false;
        end
    end

    % static method
    methods(Static)
        function obj = getInstance()
            persistent BoilerInstance
            if isempty(BoilerInstance) || ~isvalid(BoilerInstance)
                BoilerInstance = SingletonChocolateBoiler();
            end
            obj = BoilerInstance;
        end
    end
       
    methods
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

        % clear persistent variable
        function delete(obj)
            clear SingletonChocolateBoiler.getInstance
        end
    end
end

package race.genealogy;

import race.Guardian;
import race.Hydralisk;
import race.Mutalisk;
import race.Ultralisk;
import race.Zerg;
import race.Zergling;

public enum ZergList {
    ZERGLING {
        @Override
        public Zergling getZerg() {
            return new Zergling();
        }
    },
    HYDRALISK {
        @Override
        public Hydralisk getZerg() {
            return new Hydralisk();
        }
    },
    ULTRALISK {
        @Override
        public Ultralisk getZerg() {
            return new Ultralisk();
        }
    },
    MUTALISK {
        @Override
        public Mutalisk getZerg() {
            return new Mutalisk();
        }
    },
    GUARDIAN {
        @Override
        public Guardian getZerg() {
            return new Guardian();
        }
    };

    public abstract Zerg getZerg();
}

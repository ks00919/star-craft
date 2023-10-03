package race.genealogy;

import race.BattleCruzer;
import race.Goliath;
import race.Marine;
import race.Tank;
import race.Terran;
import race.Valkyrie;
import race.Wraith;

public enum TerranList {
    MARINE {
        @Override
        public Marine getTerran() {
            return new Marine();
        }
    },
    TANK {
        @Override
        public Tank getTerran() {
            return new Tank();
        }
    },
    GOLIATH {
        @Override
        public Goliath getTerran() {
            return new Goliath();
        }
    },
    WRAITH {
        @Override
        public Wraith getTerran() {
            return new Wraith();
        }
    },
    VALKYRIE {
        @Override
        public Valkyrie getTerran() {
            return new Valkyrie();
        }
    },
    BATTELCRUZER {
        @Override
        public BattleCruzer getTerran() {
            return new BattleCruzer();
        }
    };


    public abstract Terran getTerran();
}

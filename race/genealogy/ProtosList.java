package race.genealogy;

import race.Carrier;
import race.Corsair;
import race.Dragoon;
import race.HighTempler;
import race.Protos;
import race.Scout;
import race.Zealot;

public enum ProtosList {
    ZEALOT {
        @Override
        public Zealot getProtos() {
            return new Zealot();
        }
    },
    DRAGOON {
        @Override
        public Dragoon getProtos() {
            return new Dragoon();
        }
    },
    HIGHTEMPLER {
        @Override
        public HighTempler getProtos() {
            return new HighTempler();
        }
    },
    SCOUT {
        @Override
        public Scout getProtos() {
            return new Scout();
        }
    },
    CORSAIR {
        @Override
        public Corsair getProtos() {
            return new Corsair();
        }
    },
    CARRIER {
        @Override
        public Carrier getProtos() {
            return new Carrier();
        }
    };


    public abstract Protos getProtos();
}

package chess.objects;

import chess.Team;

public abstract class Piece {
    protected final Team team;

    public Piece(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return this.team;
    }
}

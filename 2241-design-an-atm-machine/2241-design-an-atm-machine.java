class ATM {
    private int[] notes = new int[]{20, 50, 100, 200, 500};
    private int[] count = new int[5];
    public ATM() {
        
    }
    
    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            this.count[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] used = new int[5];

        for (int i = 4; i >= 0; i--) {
            int canTake = Math.min(count[i], amount/notes[i]);
            used[i] = (int)canTake;
            amount -= (canTake*notes[i]);
        }

        if (amount != 0) return new int[]{-1};

        for (int i = 0; i < 5; i++) {
            this.count[i] -= used[i];
        }
        return used;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
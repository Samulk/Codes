#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

struct Player {
    string name;
    int score;
}; 

bool sortFunction(Player x, Player y) {
       if(x.score < y.score){
            return false;
        }
        if(x.score > y.score){
            return true;
        } else if(x.score == y.score) {
            if(x.name > y.name){
                return false;
            }
            if(x.name < y.name){
                return true;
            }
            
        }
        return true;
}


int main() {
    
    int n;
    cin >> n;
    vector< Player > players;
    string name;
    int score;
    for(int i = 0; i < n; i++){
        cin >> name >> score;
        Player p1;
        p1.name = name, p1.score = score;
        players.push_back(p1);
    }
    
    //vector<Player > answer = comparator(players);
    sort(players.begin(), players.end(), sortFunction);
    for(int i = 0; i < players.size(); i++) {
        cout << players[i].name << " " << players[i].score << endl;
    }
    return 0;
}

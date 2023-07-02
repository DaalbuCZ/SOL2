.class Lh0/e;
.super Lh0/d;
.source ""

# interfaces
.implements Lg0/f;


# instance fields
.field private final o:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method constructor <init>(Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0, p1}, Lh0/d;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    iput-object p1, p0, Lh0/e;->o:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public S()J
    .locals 2

    iget-object v0, p0, Lh0/e;->o:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    return-wide v0
.end method

.method public t()I
    .locals 1

    iget-object v0, p0, Lh0/e;->o:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result v0

    return v0
.end method

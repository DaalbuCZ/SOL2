.class Lh0/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg0/d;


# instance fields
.field private final n:Landroid/database/sqlite/SQLiteProgram;


# direct methods
.method constructor <init>(Landroid/database/sqlite/SQLiteProgram;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    return-void
.end method


# virtual methods
.method public A(ID)V
    .locals 1

    iget-object v0, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

    return-void
.end method

.method public I(IJ)V
    .locals 1

    iget-object v0, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    return-void
.end method

.method public N(I[B)V
    .locals 1

    iget-object v0, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteProgram;->close()V

    return-void
.end method

.method public s(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    return-void
.end method

.method public z(I)V
    .locals 1

    iget-object v0, p0, Lh0/d;->n:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    return-void
.end method

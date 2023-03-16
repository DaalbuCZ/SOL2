.class public Lw7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;


# instance fields
.field private n:Ll8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 2

    new-instance v0, Ll8/k;

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    const-string v1, "sqlcipher_flutter_libs"

    invoke-direct {v0, p1, v1}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lw7/a;->n:Ll8/k;

    new-instance p1, Lw7/a$a;

    invoke-direct {p1, p0}, Lw7/a$a;-><init>(Lw7/a;)V

    invoke-virtual {v0, p1}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 1

    iget-object p1, p0, Lw7/a;->n:Ll8/k;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll8/k;->e(Ll8/k$c;)V

    iput-object v0, p0, Lw7/a;->n:Ll8/k;

    :cond_0
    return-void
.end method

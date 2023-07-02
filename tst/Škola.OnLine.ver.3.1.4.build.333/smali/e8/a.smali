.class public Le8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;


# instance fields
.field private n:Lt8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 2

    new-instance v0, Lt8/k;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    const-string v1, "sqlcipher_flutter_libs"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Le8/a;->n:Lt8/k;

    new-instance p1, Le8/a$a;

    invoke-direct {p1, p0}, Le8/a$a;-><init>(Le8/a;)V

    invoke-virtual {v0, p1}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    iget-object p1, p0, Le8/a;->n:Lt8/k;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    iput-object v0, p0, Le8/a;->n:Lt8/k;

    :cond_0
    return-void
.end method

.class public abstract Lj9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g$b;


# instance fields
.field private final n:Lj9/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/g$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj9/a;->n:Lj9/g$c;

    return-void
.end method


# virtual methods
.method public E(Lj9/g;)Lj9/g;
    .locals 0

    invoke-static {p0, p1}, Lj9/g$b$a;->d(Lj9/g$b;Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lj9/g$c;)Lj9/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "*>;)",
            "Lj9/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/g$b$a;->c(Lj9/g$b;Lj9/g$c;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public c(Lj9/g$c;)Lj9/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj9/g$b;",
            ">(",
            "Lj9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/g$b$a;->b(Lj9/g$b;Lj9/g$c;)Lj9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lj9/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj9/g$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lj9/a;->n:Lj9/g$c;

    return-object v0
.end method

.method public v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lj9/g$b$a;->a(Lj9/g$b;Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

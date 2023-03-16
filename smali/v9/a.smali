.class public final Lv9/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g;


# instance fields
.field public final n:Ljava/lang/Throwable;

.field private final synthetic o:Lb9/g;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lb9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/a;->n:Ljava/lang/Throwable;

    iput-object p2, p0, Lv9/a;->o:Lb9/g;

    return-void
.end method


# virtual methods
.method public B(Lb9/g$c;)Lb9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g$c<",
            "*>;)",
            "Lb9/g;"
        }
    .end annotation

    iget-object v0, p0, Lv9/a;->o:Lb9/g;

    invoke-interface {v0, p1}, Lb9/g;->B(Lb9/g$c;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

.method public S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lj9/p<",
            "-TR;-",
            "Lb9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lv9/a;->o:Lb9/g;

    invoke-interface {v0, p1, p2}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lb9/g$c;)Lb9/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lb9/g$b;",
            ">(",
            "Lb9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    iget-object v0, p0, Lv9/a;->o:Lb9/g;

    invoke-interface {v0, p1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public j(Lb9/g;)Lb9/g;
    .locals 1

    iget-object v0, p0, Lv9/a;->o:Lb9/g;

    invoke-interface {v0, p1}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

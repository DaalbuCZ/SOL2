.class public abstract Lz9/d0;
.super Lj9/a;
.source ""

# interfaces
.implements Lj9/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/d0$a;
    }
.end annotation


# static fields
.field public static final o:Lz9/d0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz9/d0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz9/d0$a;-><init>(Ls9/g;)V

    sput-object v0, Lz9/d0;->o:Lz9/d0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lj9/e;->k:Lj9/e$b;

    invoke-direct {p0, v0}, Lj9/a;-><init>(Lj9/g$c;)V

    return-void
.end method


# virtual methods
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

    invoke-static {p0, p1}, Lj9/e$a;->b(Lj9/e;Lj9/g$c;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public final V(Lj9/d;)Lj9/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/d<",
            "-TT;>;)",
            "Lj9/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/h;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/h;-><init>(Lz9/d0;Lj9/d;)V

    return-object v0
.end method

.method public W(Lj9/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public X(I)Lz9/d0;
    .locals 1

    invoke-static {p1}, Lkotlinx/coroutines/internal/o;->a(I)V

    new-instance v0, Lkotlinx/coroutines/internal/n;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/n;-><init>(Lz9/d0;I)V

    return-object v0
.end method

.method public abstract b(Lj9/g;Ljava/lang/Runnable;)V
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

    invoke-static {p0, p1}, Lj9/e$a;->a(Lj9/e;Lj9/g$c;)Lj9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lj9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "*>;)V"
        }
    .end annotation

    check-cast p1, Lkotlinx/coroutines/internal/h;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/h;->v()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lz9/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lz9/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

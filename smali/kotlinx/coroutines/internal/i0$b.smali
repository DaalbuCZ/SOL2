.class final Lkotlinx/coroutines/internal/i0$b;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/internal/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/p<",
        "Lr9/f2<",
        "*>;",
        "Lb9/g$b;",
        "Lr9/f2<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final o:Lkotlinx/coroutines/internal/i0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/i0$b;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/i0$b;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/i0$b;->o:Lkotlinx/coroutines/internal/i0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr9/f2;Lb9/g$b;)Lr9/f2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/f2<",
            "*>;",
            "Lb9/g$b;",
            ")",
            "Lr9/f2<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lr9/f2;

    if-eqz p1, :cond_1

    check-cast p2, Lr9/f2;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr9/f2;

    check-cast p2, Lb9/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/i0$b;->a(Lr9/f2;Lb9/g$b;)Lr9/f2;

    move-result-object p1

    return-object p1
.end method

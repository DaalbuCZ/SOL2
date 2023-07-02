.class final Lz9/c0$a;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/c0;->a(Lj9/g;Lj9/g;Z)Lj9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/p<",
        "Lj9/g;",
        "Lj9/g$b;",
        "Lj9/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lz9/c0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/c0$a;

    invoke-direct {v0}, Lz9/c0$a;-><init>()V

    sput-object v0, Lz9/c0$a;->o:Lz9/c0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj9/g;Lj9/g$b;)Lj9/g;
    .locals 1

    instance-of v0, p2, Lz9/a0;

    if-eqz v0, :cond_0

    check-cast p2, Lz9/a0;

    invoke-interface {p2}, Lz9/a0;->w()Lz9/a0;

    move-result-object p2

    invoke-interface {p1, p2}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj9/g;

    check-cast p2, Lj9/g$b;

    invoke-virtual {p0, p1, p2}, Lz9/c0$a;->a(Lj9/g;Lj9/g$b;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

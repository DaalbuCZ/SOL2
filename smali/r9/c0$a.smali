.class final Lr9/c0$a;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr9/c0;->a(Lb9/g;Lb9/g;Z)Lb9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/p<",
        "Lb9/g;",
        "Lb9/g$b;",
        "Lb9/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lr9/c0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/c0$a;

    invoke-direct {v0}, Lr9/c0$a;-><init>()V

    sput-object v0, Lr9/c0$a;->o:Lr9/c0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lb9/g;Lb9/g$b;)Lb9/g;
    .locals 1

    instance-of v0, p2, Lr9/a0;

    if-eqz v0, :cond_0

    check-cast p2, Lr9/a0;

    invoke-interface {p2}, Lr9/a0;->t()Lr9/a0;

    move-result-object p2

    invoke-interface {p1, p2}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, p2}, Lb9/g;->j(Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb9/g;

    check-cast p2, Lb9/g$b;

    invoke-virtual {p0, p1, p2}, Lr9/c0$a;->a(Lb9/g;Lb9/g$b;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

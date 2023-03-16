.class final Lr9/g1$a$a;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr9/g1$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/l<",
        "Lb9/g$b;",
        "Lr9/g1;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lr9/g1$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/g1$a$a;

    invoke-direct {v0}, Lr9/g1$a$a;-><init>()V

    sput-object v0, Lr9/g1$a$a;->o:Lr9/g1$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lb9/g$b;)Lr9/g1;
    .locals 1

    instance-of v0, p1, Lr9/g1;

    if-eqz v0, :cond_0

    check-cast p1, Lr9/g1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb9/g$b;

    invoke-virtual {p0, p1}, Lr9/g1$a$a;->a(Lb9/g$b;)Lr9/g1;

    move-result-object p1

    return-object p1
.end method

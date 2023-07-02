.class final Lz9/d0$a$a;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/d0$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/l<",
        "Lj9/g$b;",
        "Lz9/d0;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lz9/d0$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/d0$a$a;

    invoke-direct {v0}, Lz9/d0$a$a;-><init>()V

    sput-object v0, Lz9/d0$a$a;->o:Lz9/d0$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj9/g$b;)Lz9/d0;
    .locals 1

    instance-of v0, p1, Lz9/d0;

    if-eqz v0, :cond_0

    check-cast p1, Lz9/d0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj9/g$b;

    invoke-virtual {p0, p1}, Lz9/d0$a$a;->a(Lj9/g$b;)Lz9/d0;

    move-result-object p1

    return-object p1
.end method

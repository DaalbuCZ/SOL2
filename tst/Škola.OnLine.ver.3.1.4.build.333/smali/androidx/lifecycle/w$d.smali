.class final Landroidx/lifecycle/w$d;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/w;->b(Landroidx/lifecycle/f0;)Landroidx/lifecycle/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/l<",
        "Ly/a;",
        "Landroidx/lifecycle/y;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Landroidx/lifecycle/w$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/w$d;

    invoke-direct {v0}, Landroidx/lifecycle/w$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/w$d;->o:Landroidx/lifecycle/w$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly/a;)Landroidx/lifecycle/y;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/y;

    invoke-direct {p1}, Landroidx/lifecycle/y;-><init>()V

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly/a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/w$d;->a(Ly/a;)Landroidx/lifecycle/y;

    move-result-object p1

    return-object p1
.end method

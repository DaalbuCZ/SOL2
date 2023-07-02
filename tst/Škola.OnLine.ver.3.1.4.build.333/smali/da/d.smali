.class public final Lda/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lr9/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/q<",
            "Lca/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lda/d$a;->w:Lda/d$a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ls9/u;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr9/q;

    sput-object v0, Lda/d;->a:Lr9/q;

    return-void
.end method

.method public static final synthetic a()Lr9/q;
    .locals 1

    sget-object v0, Lda/d;->a:Lr9/q;

    return-object v0
.end method

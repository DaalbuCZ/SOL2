.class final synthetic Lda/d$a;
.super Ls9/j;
.source ""

# interfaces
.implements Lr9/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lda/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/j;",
        "Lr9/q<",
        "Lca/c<",
        "-",
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


# static fields
.field public static final w:Lda/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/d$a;

    invoke-direct {v0}, Lda/d$a;-><init>()V

    sput-object v0, Lda/d$a;->w:Lda/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-class v2, Lca/c;

    const/4 v1, 0x3

    const-string v3, "emit"

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ls9/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final j(Lca/c;Ljava/lang/Object;Lj9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1, p2, p3}, Lca/c;->a(Ljava/lang/Object;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/c;

    check-cast p3, Lj9/d;

    invoke-virtual {p0, p1, p2, p3}, Lda/d$a;->j(Lca/c;Ljava/lang/Object;Lj9/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

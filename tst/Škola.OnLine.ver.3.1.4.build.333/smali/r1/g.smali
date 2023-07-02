.class public final Lr1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln1/b<",
        "Ls1/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lf9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf9/a<",
            "Lv1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf9/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Lv1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/g;->a:Lf9/a;

    return-void
.end method

.method public static a(Lv1/a;)Ls1/g;
    .locals 1

    invoke-static {p0}, Lr1/f;->a(Lv1/a;)Ls1/g;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Ln1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls1/g;

    return-object p0
.end method

.method public static b(Lf9/a;)Lr1/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/a<",
            "Lv1/a;",
            ">;)",
            "Lr1/g;"
        }
    .end annotation

    new-instance v0, Lr1/g;

    invoke-direct {v0, p0}, Lr1/g;-><init>(Lf9/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ls1/g;
    .locals 1

    iget-object v0, p0, Lr1/g;->a:Lf9/a;

    invoke-interface {v0}, Lf9/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv1/a;

    invoke-static {v0}, Lr1/g;->a(Lv1/a;)Ls1/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr1/g;->c()Ls1/g;

    move-result-object v0

    return-object v0
.end method

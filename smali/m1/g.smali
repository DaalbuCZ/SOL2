.class public final Lm1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Ln1/g;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lq1/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/g;->a:Lx8/a;

    return-void
.end method

.method public static a(Lq1/a;)Ln1/g;
    .locals 1

    invoke-static {p0}, Lm1/f;->a(Lq1/a;)Ln1/g;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Li1/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln1/g;

    return-object p0
.end method

.method public static b(Lx8/a;)Lm1/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lq1/a;",
            ">;)",
            "Lm1/g;"
        }
    .end annotation

    new-instance v0, Lm1/g;

    invoke-direct {v0, p0}, Lm1/g;-><init>(Lx8/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ln1/g;
    .locals 1

    iget-object v0, p0, Lm1/g;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/a;

    invoke-static {v0}, Lm1/g;->a(Lq1/a;)Ln1/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm1/g;->c()Ln1/g;

    move-result-object v0

    return-object v0
.end method

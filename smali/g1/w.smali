.class public final Lg1/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li1/b<",
        "Lg1/u;",
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

.field private final b:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lq1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Lm1/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/s;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lx8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx8/a<",
            "Ln1/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lm1/e;",
            ">;",
            "Lx8/a<",
            "Ln1/s;",
            ">;",
            "Lx8/a<",
            "Ln1/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/w;->a:Lx8/a;

    iput-object p2, p0, Lg1/w;->b:Lx8/a;

    iput-object p3, p0, Lg1/w;->c:Lx8/a;

    iput-object p4, p0, Lg1/w;->d:Lx8/a;

    iput-object p5, p0, Lg1/w;->e:Lx8/a;

    return-void
.end method

.method public static a(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)Lg1/w;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lq1/a;",
            ">;",
            "Lx8/a<",
            "Lm1/e;",
            ">;",
            "Lx8/a<",
            "Ln1/s;",
            ">;",
            "Lx8/a<",
            "Ln1/w;",
            ">;)",
            "Lg1/w;"
        }
    .end annotation

    new-instance v6, Lg1/w;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg1/w;-><init>(Lx8/a;Lx8/a;Lx8/a;Lx8/a;Lx8/a;)V

    return-object v6
.end method

.method public static c(Lq1/a;Lq1/a;Lm1/e;Ln1/s;Ln1/w;)Lg1/u;
    .locals 7

    new-instance v6, Lg1/u;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lg1/u;-><init>(Lq1/a;Lq1/a;Lm1/e;Ln1/s;Ln1/w;)V

    return-object v6
.end method


# virtual methods
.method public b()Lg1/u;
    .locals 5

    iget-object v0, p0, Lg1/w;->a:Lx8/a;

    invoke-interface {v0}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/a;

    iget-object v1, p0, Lg1/w;->b:Lx8/a;

    invoke-interface {v1}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq1/a;

    iget-object v2, p0, Lg1/w;->c:Lx8/a;

    invoke-interface {v2}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    iget-object v3, p0, Lg1/w;->d:Lx8/a;

    invoke-interface {v3}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln1/s;

    iget-object v4, p0, Lg1/w;->e:Lx8/a;

    invoke-interface {v4}, Lx8/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln1/w;

    invoke-static {v0, v1, v2, v3, v4}, Lg1/w;->c(Lq1/a;Lq1/a;Lm1/e;Ln1/s;Ln1/w;)Lg1/u;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg1/w;->b()Lg1/u;

    move-result-object v0

    return-object v0
.end method

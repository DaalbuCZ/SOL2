.class final Lb6/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final n:Lv5/p;

.field private final o:Ly4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly4/j<",
            "Lv5/p;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Lb6/e;


# direct methods
.method private constructor <init>(Lb6/e;Lv5/p;Ly4/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/p;",
            "Ly4/j<",
            "Lv5/p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb6/e$b;->p:Lb6/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb6/e$b;->n:Lv5/p;

    iput-object p3, p0, Lb6/e$b;->o:Ly4/j;

    return-void
.end method

.method synthetic constructor <init>(Lb6/e;Lv5/p;Ly4/j;Lb6/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb6/e$b;-><init>(Lb6/e;Lv5/p;Ly4/j;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lb6/e$b;->p:Lb6/e;

    iget-object v1, p0, Lb6/e$b;->n:Lv5/p;

    iget-object v2, p0, Lb6/e$b;->o:Ly4/j;

    invoke-static {v0, v1, v2}, Lb6/e;->c(Lb6/e;Lv5/p;Ly4/j;)V

    iget-object v0, p0, Lb6/e$b;->p:Lb6/e;

    invoke-static {v0}, Lb6/e;->d(Lb6/e;)Lv5/b0;

    move-result-object v0

    invoke-virtual {v0}, Lv5/b0;->e()V

    iget-object v0, p0, Lb6/e$b;->p:Lb6/e;

    invoke-static {v0}, Lb6/e;->e(Lb6/e;)D

    move-result-wide v0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Delay for: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const-string v6, "%.2f"

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " s for report: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lb6/e$b;->n:Lv5/p;

    invoke-virtual {v4}, Lv5/p;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lb6/e;->f(D)V

    return-void
.end method

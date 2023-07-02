.class public final Ly6/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf9/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf9/a;"
    }
.end annotation


# instance fields
.field private final a:Ly6/a;


# direct methods
.method public constructor <init>(Ly6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/b;->a:Ly6/a;

    return-void
.end method

.method public static a(Ly6/a;)Ly6/b;
    .locals 1

    new-instance v0, Ly6/b;

    invoke-direct {v0, p0}, Ly6/b;-><init>(Ly6/a;)V

    return-object v0
.end method

.method public static c(Ly6/a;)Lcom/google/firebase/perf/config/a;
    .locals 1

    invoke-virtual {p0}, Ly6/a;->a()Lcom/google/firebase/perf/config/a;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lz7/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/perf/config/a;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/firebase/perf/config/a;
    .locals 1

    iget-object v0, p0, Ly6/b;->a:Ly6/a;

    invoke-static {v0}, Ly6/b;->c(Ly6/a;)Lcom/google/firebase/perf/config/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly6/b;->b()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    return-object v0
.end method

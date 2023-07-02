.class public final Ly6/e;
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

    iput-object p1, p0, Ly6/e;->a:Ly6/a;

    return-void
.end method

.method public static a(Ly6/a;)Ly6/e;
    .locals 1

    new-instance v0, Ly6/e;

    invoke-direct {v0, p0}, Ly6/e;-><init>(Ly6/a;)V

    return-object v0
.end method

.method public static c(Ly6/a;)Ln6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/a;",
            ")",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ly6/a;->d()Ln6/b;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lz7/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln6/b;

    return-object p0
.end method


# virtual methods
.method public b()Ln6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly6/e;->a:Ly6/a;

    invoke-static {v0}, Ly6/e;->c(Ly6/a;)Ln6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly6/e;->b()Ln6/b;

    move-result-object v0

    return-object v0
.end method

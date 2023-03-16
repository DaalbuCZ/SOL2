.class public final Lt6/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx8/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx8/a;"
    }
.end annotation


# instance fields
.field private final a:Lt6/a;


# direct methods
.method public constructor <init>(Lt6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/c;->a:Lt6/a;

    return-void
.end method

.method public static a(Lt6/a;)Lt6/c;
    .locals 1

    new-instance v0, Lt6/c;

    invoke-direct {v0, p0}, Lt6/c;-><init>(Lt6/a;)V

    return-object v0
.end method

.method public static c(Lt6/a;)Lf5/e;
    .locals 1

    invoke-virtual {p0}, Lt6/a;->b()Lf5/e;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lr7/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf5/e;

    return-object p0
.end method


# virtual methods
.method public b()Lf5/e;
    .locals 1

    iget-object v0, p0, Lt6/c;->a:Lt6/a;

    invoke-static {v0}, Lt6/c;->c(Lt6/a;)Lf5/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt6/c;->b()Lf5/e;

    move-result-object v0

    return-object v0
.end method

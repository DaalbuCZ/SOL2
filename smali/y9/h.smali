.class public abstract Ly9/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ly9/d;JLaa/b;)Ly9/h;
    .locals 1
    .param p0    # Ly9/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "source == null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ly9/h$a;

    invoke-direct {v0, p0, p1, p2, p3}, Ly9/h$a;-><init>(Ly9/d;JLaa/b;)V

    return-object v0
.end method

.method public static b(Ly9/d;[B)Ly9/h;
    .locals 3
    .param p0    # Ly9/d;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Laa/a;

    invoke-direct {v0}, Laa/a;-><init>()V

    invoke-virtual {v0, p1}, Laa/a;->X([B)Laa/a;

    move-result-object v0

    array-length p1, p1

    int-to-long v1, p1

    invoke-static {p0, v1, v2, v0}, Ly9/h;->a(Ly9/d;JLaa/b;)Ly9/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c()Laa/b;
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Ly9/h;->c()Laa/b;

    move-result-object v0

    invoke-static {v0}, Lz9/a;->c(Ljava/io/Closeable;)V

    return-void
.end method

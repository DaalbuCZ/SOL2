.class public Ld1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/r<",
        "Ld1/k3;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ld1/p;


# direct methods
.method public constructor <init>(Ld1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/l;->a:Ld1/p;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/File;)V
    .locals 0

    check-cast p1, Ld1/k3;

    invoke-virtual {p0, p1, p2}, Ld1/l;->b(Ld1/k3;Ljava/io/File;)V

    return-void
.end method

.method public b(Ld1/k3;Ljava/io/File;)V
    .locals 1

    iget-object v0, p0, Ld1/l;->a:Ld1/p;

    invoke-virtual {v0, p1}, Ld1/p;->d(Ld1/k3;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    new-instance v0, Ljava/io/FileWriter;

    invoke-direct {v0, p2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Ld1/i0;->c(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.class public Ly0/g3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/p1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/p1<",
        "Ljava/util/List<",
        "Ly0/d3;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ly0/n3;


# direct methods
.method public constructor <init>(Ly0/n3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/g3;->a:Ly0/n3;

    return-void
.end method

.method private c(Ljava/io/File;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ly0/d3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/Scanner;

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, p1}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-direct {v0, v1}, Ljava/util/Scanner;-><init>(Ljava/lang/Readable;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/util/Scanner;->hasNextLine()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ly0/g3;->a:Ly0/n3;

    invoke-virtual {v0}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly0/n3;->d(Ljava/lang/String;)Ly0/d3;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/Scanner;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/Scanner;->close()V

    throw p1
.end method


# virtual methods
.method public a(Ljava/io/File;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ly0/d3;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p1}, Ly0/g3;->c(Ljava/io/File;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/io/File;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ly0/g3;->a(Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.class Lio/flutter/embedding/engine/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field final a:La8/f;


# direct methods
.method private constructor <init>(La8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/engine/c$b;->a:La8/f;

    return-void
.end method

.method synthetic constructor <init>(La8/f;Lio/flutter/embedding/engine/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/embedding/engine/c$b;-><init>(La8/f;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/c$b;->a:La8/f;

    invoke-virtual {v0, p1}, La8/f;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

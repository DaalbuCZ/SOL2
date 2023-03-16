.class final enum Lb5/u$c;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lj$/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb5/u$c;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;",
        "Lj$/util/Iterator;"
    }
.end annotation


# static fields
.field public static final enum n:Lb5/u$c;

.field private static final synthetic o:[Lb5/u$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb5/u$c;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb5/u$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb5/u$c;->n:Lb5/u$c;

    invoke-static {}, Lb5/u$c;->g()[Lb5/u$c;

    move-result-object v0

    sput-object v0, Lb5/u$c;->o:[Lb5/u$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic g()[Lb5/u$c;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lb5/u$c;

    sget-object v1, Lb5/u$c;->n:Lb5/u$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb5/u$c;
    .locals 1

    const-class v0, Lb5/u$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb5/u$c;

    return-object p0
.end method

.method public static values()[Lb5/u$c;
    .locals 1

    sget-object v0, Lb5/u$c;->o:[Lb5/u$c;

    invoke-virtual {v0}, [Lb5/u$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb5/u$c;

    return-object v0
.end method


# virtual methods
.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Iterator$-CC;->$default$forEachRemaining(Ljava/util/Iterator;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb5/u$c;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lb5/h;->c(Z)V

    return-void
.end method

.class public final Ln7/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk7/x;


# instance fields
.field private final n:Lm7/c;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/e;->n:Lm7/c;

    return-void
.end method


# virtual methods
.method a(Lm7/c;Lk7/e;Lr7/a;Ll7/b;)Lk7/w;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c;",
            "Lk7/e;",
            "Lr7/a<",
            "*>;",
            "Ll7/b;",
            ")",
            "Lk7/w<",
            "*>;"
        }
    .end annotation

    invoke-interface {p4}, Ll7/b;->value()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lr7/a;->a(Ljava/lang/Class;)Lr7/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm7/c;->a(Lr7/a;)Lm7/i;

    move-result-object p1

    invoke-interface {p1}, Lm7/i;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lk7/w;

    if-eqz v0, :cond_0

    check-cast p1, Lk7/w;

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lk7/x;

    if-eqz v0, :cond_1

    check-cast p1, Lk7/x;

    invoke-interface {p1, p2, p3}, Lk7/x;->create(Lk7/e;Lr7/a;)Lk7/w;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lk7/r;

    if-nez v0, :cond_3

    instance-of v1, p1, Lk7/j;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid attempt to bind an instance of "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lr7/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lk7/r;

    move-object v3, v0

    goto :goto_1

    :cond_4
    move-object v3, v1

    :goto_1
    instance-of v0, p1, Lk7/j;

    if-eqz v0, :cond_5

    move-object v1, p1

    check-cast v1, Lk7/j;

    :cond_5
    move-object v4, v1

    new-instance p1, Ln7/l;

    const/4 v7, 0x0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Ln7/l;-><init>(Lk7/r;Lk7/j;Lk7/e;Lr7/a;Lk7/x;)V

    :goto_2
    if-eqz p1, :cond_6

    invoke-interface {p4}, Ll7/b;->nullSafe()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lk7/w;->b()Lk7/w;

    move-result-object p1

    :cond_6
    return-object p1
.end method

.method public create(Lk7/e;Lr7/a;)Lk7/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lk7/e;",
            "Lr7/a<",
            "TT;>;)",
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lr7/a;->c()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll7/b;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ll7/b;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Ln7/e;->n:Lm7/c;

    invoke-virtual {p0, v1, p1, p2, v0}, Ln7/e;->a(Lm7/c;Lk7/e;Lr7/a;Ll7/b;)Lk7/w;

    move-result-object p1

    return-object p1
.end method
